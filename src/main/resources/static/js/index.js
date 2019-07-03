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