$(document).ready(function () {
    $("#btn").click(function () {
        if (confirm("确认上传？")) {
            var imagePath = $("#uploadimage").val();
            alert(imagePath);
            if (imagePath == "") {
                alert("Please upload image file", 2);
                return false;
            }
            var imagepath = imagePath.toString();
            var strExtension = imagepath.substring(imagepath.lastIndexOf('.')+1,imagepath.length);
            //格式检查
            if (strExtension != 'jpg') {
                if (strExtension != 'png') {
                    if (strExtension != 'bmp') {
                        alert("Please upload a file that is a image", 2);
                        return false;
                    }
                }
            }

        }
    });
})
function changImg(e) {
    var file = e.target.files.item(0);
    var freader = new FileReader();
    freader.readAsDataURL(file);
    freader.onload = function (e) {
        alert('文件读取完成');
        $("#image").attr("src",e.target.result);
    }
}
