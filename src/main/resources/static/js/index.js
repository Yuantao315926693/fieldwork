const signUpButton = document.getElementById('signUp');
const signInButton = document.getElementById('signIn');
const container = document.getElementById('container');

signUpButton.addEventListener('click', () => {
	container.classList.add("right-panel-active");
});

signInButton.addEventListener('click', () => {
	container.classList.remove("right-panel-active");
});
function login(){
    var form1 = document.getElementById("form_login");
	if(form1.username.value==''){
		alert('用户名不能为空！');
		return false;
	}
	if(form1.password.value==''){
		alert('密码不能为空！');
		return false;
	}
    form1.submit();
}
function register(){
    var form2 = document.getElementById("form_res");
    if(form2.name.value==''){
    	alter('用户名不能为空！')
    	return false;
    }
	if(form2.username.value==''){
		alert('电话不能为空！');
		return false;
	}
	if(form2.password.value==''){
		alert('密码不能为空！');
		return false;
	}
    form2.submit();
}
function ValueChange(value,index){
	// alert($(value).attr("id"));
	// alert($(value).val());
	//alert(typeof ($(value).val()));
	if($(value).val()==""){
        alert('不能为空！');
        return false;
	}
	// alert($(value).val());
    $.ajax({
        type: "POST",
        url:"/userRegister/verifty",
		data: "index="+index.toString()+"&"+$(value).attr("id")+"="+$(value).val(),
    	dataType:"json",
		// data: $("#form_user").serialize(),
        success: function(msg){
        	// alert(msg);
        	// alert(typeof (msg));
            // $.messager.progress("close");
            // if(msg.state){
            //     $.messager.alert('提示',msg.msg,'info');
            // } else {
            //     $.messager.alert('提示',msg.msg,'error');
            // }
            // $('#win_user_add').window('close');
            // $("#grid_user").datagrid('reload');
			if(msg){
                alert("该"+$(value).attr("id")+":"+$(value).val()+" 已经存在");
				$(value).val(function(i,origText) {
                    return origText + " 已经存在";
                })
			}
        }
    })
}
// window.onload = function(){
// 	var i3 = document.getElementsByClassName('input_3');
// 	for(var i=0;i<i3.length;i++){
// 		i3[i].onmouseover = function(){
// 			this.style.backgroundColor = "#23271F";
// 			this.style.color = "#fff";
// 		}
// 		i3[i].onmouseout = function(){
// 			this.style.backgroundColor = "#fff";
// 			this.style.color = "#23271F";
// 		}
// 	}
// 	var pass = document.getElementById("password");
// 	pass.onfocus = function(){
// 		pass.type = "password";
// 	}
// }