<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="icon" href="data:;base64,iVBORw0KGgo=">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v6.4.0/css/all.css">
<style type="text/css">
* { padding: 0; margin: 0; }
*, *::after, *::before { box-sizing: border-box; }

body {
	font-family:"Malgun Gothic", "맑은 고딕", NanumGothic, 나눔고딕, 돋움, sans-serif;
	font-size: 14px;
	color: #222;
}

a { color: #222; text-decoration: none; cursor: pointer; }
a:active, a:hover { color: #f28011; text-decoration: underline; }

/* form-control */
.btn {
	color: #333;
	border: 1px solid #999;
	background-color: #fff;
	padding: 5px 10px;
	border-radius: 4px;
	font-weight: 500;
	cursor:pointer;
	font-size: 14px;
	font-family: "맑은 고딕", 나눔고딕, 돋움, sans-serif;
	vertical-align: baseline;
}
.btn:active, .btn:focus, .btn:hover {
	background-color: #f8f9fa;
	color:#333;
}
.btn[disabled], fieldset[disabled] .btn {
	pointer-events: none;
	cursor: default;
	opacity: .65;
}

.form-control {
	border: 1px solid #999; border-radius: 4px; background-color: #fff;
	padding: 5px 5px; 
	font-family: "맑은 고딕", 나눔고딕, 돋움, sans-serif;
	vertical-align: baseline;
}
.form-control[readonly] { background-color:#f8f9fa; }

textarea.form-control { height: 170px; resize : none; }

.form-select {
	border: 1px solid #999; border-radius: 4px; background-color: #fff;
	padding: 4px 5px; 
	font-family: "맑은 고딕", 나눔고딕, 돋움, sans-serif;
	vertical-align: baseline;
}
.form-select[readonly] { background-color:#f8f9fa; }

textarea:focus, input:focus { outline: none; }
input[type=checkbox], input[type=radio] { vertical-align: middle; }

/* table */
.table { width: 100%; border-spacing: 0; border-collapse: collapse; }
.table th, .table td { padding-top: 10px; padding-bottom: 10px; }

.table-border thead > tr { border-top: 2px solid #212529; border-bottom: 1px solid #ced4da; }
.table-border tbody > tr { border-bottom: 1px solid #ced4da; }
.table-border tfoot > tr { border-bottom: 1px solid #ced4da; }
.td-border td { border: 1px solid #ced4da; }

/* container */
.body-container { width: 700px; margin: 30px auto 10px; }

.body-title {
    margin: 0 0 25px 0;
    padding-top: 25px; padding-bottom: 5px;
    color: #424951;
    border-bottom: 1px solid #ddd;
}
.body-title h3 {
    min-width: 300px;
    margin: 0 0 -5px 0;
    padding-bottom: 5px;
    font-size: 23px;
    font-family:"Malgun Gothic", "맑은 고딕", NanumGothic, 나눔고딕, 돋움, sans-serif;
    font-weight: bold;
    display: inline-block;
    border-bottom: 3px solid #424951;
}

.member-form .input-session { margin-bottom: 15px; }
.member-form .input-title { font-size: 13px; color: #212121; line-height: 180%; }
.member-form .input-title { font-size: 14px; color: #212121; }

.member-form .input-box { border: 1px solid #212529; padding: 10px 10px; clear: both; }
.member-form .input-box p { padding: 3px 0; }
.member-form .input-box label { display:inline-block; width: 110px; }
.member-form .input-box span{ display: inline-block; }

.member-form .member-confirm { line-height: 150%; text-align: center; }

.member-form input[type=text]:focus, .member-form input[type=date]:focus, .member-form input[type=password]:focus {
	border: 1px solid #222; }

.schoolRemoveBtn, .licenseRemoveBtn {
	width: 40px; text-align: center; cursor: pointer; display: inline-block; }
</style>

<script src="https://code.jquery.com/jquery-3.6.4.min.js"></script>
<script type="text/javascript">
$(function(){
    $(".schoolRemoveBtn").hide();
    $(".licenseRemoveBtn").hide();
    
    $(".schoolAddBtn").click(function(){
        $(".schoolRemoveBtn").show();
        
        // const p = $(this).parent().parent().find("div:first-child  :first").html();
        // const p = $(this).parent().parent().find("div:first-child").children("p").html();
        // $(this).parent().parent().find("div:first").append("<p>"+p+"</p>");
        
        // 자신의 html : 첫번째 p태그를 복제하여 div로 감싼후 div안의 html요소가져 오기
        // const p = $(this).parent().parent().find("div:first-child  :first").clone().wrapAll("<div>").parent().html();
        // $(this).parent().parent().find("div:first").append(p);

        const p = $(this).parent().parent().find("div:first-child  :first").clone();
        $(p).find("input").each(function(){
        	$(this).val("");
        });
        $(this).parent().parent().find("div:first").append(p);
    });
    
    $("body").on("click", ".schoolRemoveBtn", function(){
        if($(this).closest("div").find("p").length<=1) { // closest("태그") : 가장가까운 부모태그
            return;
        }
        
        $(this).parent().remove();
        
        if($(".schoolRemoveBtn").closest("div").find("p").length<=1) {
            $(".schoolRemoveBtn").hide();
        }
    });
});

$(function(){
    $(".licenseAddBtn").click(function(){
        $(".licenseRemoveBtn").show();
        const p = $(this).parent().parent().find("div:first-child  :first").clone().wrapAll("<div>").parent().html();
        $(p).find("input").each(function(){
        	$(this).val("");
        });

        $(this).parent().parent().find("div:first").append(p);
    });
    
    $("body").on("click", ".licenseRemoveBtn", function(){
        if($(this).closest("div").find("p").length<=1) {
            return;
        }
        
        $(this).parent().remove();
        
        if($(".licenseRemoveBtn").closest("div").find("p").length<=1) {
            $(".licenseRemoveBtn").hide();
        }
    });
});

function sendOk() {

	const f = document.memberForm;
		let str;

		str = f.userId.value.trim();
		if (!/^[a-z][a-z0-9_]{4,9}$/i.test(str)) {
			alert("아이디는 5~10자이며 첫글자는 영문자이어야 합니다.");
			f.userId.focus();
			return;
		}

		str = f.userPwd.value.trim();
		if (!/^(?=.*[a-z])(?=.*[!@#$%^*+=-]|.*[0-9]).{5,10}$/i.test(str)) {
			alert("패스워드는 5~10자이며 하나 이상의 숫자나 특수문자가 포함되어야 합니다.");
			f.userPwd.focus();
			return;
		}

		str = f.userName.value.trim();
		if (!str) {
			alert("이름을 입력하세요. ");
			f.userName.focus();
			return;
		}

		let b;
		b = true;
		$("input[name=schoolName]").each(function(index) {
			if (!$(this).val()) {
				b = false;
			}
			if (!b)
				return false;

			if (!$("input[name=schoolDate1]").eq(index).val()) {
				b = false;
			}
			if (!b)
				return false;

			if (!$("input[name=schoolDate2]").eq(index).val()) {
				b = false;
			}
			if (!b)
				return false;
		});

		if (!b) {
			alert("학력사항을 정확히 입력 하세요");
			return;
		}

		b = true;
		$("input[name=licenseName]").each(function(index) {
			if (!$(this).val()) {
				$("input[name=licenseDate]").eq(index).val("");
				return false;
			}

			if (!$("input[name=licenseDate]").eq(index).val()) {
				b = false;
			}
			if (!b)
				return false;
		});
		if (!b) {
			alert("자격증 정보를 입력 하세요");
			return;
		}

		// 입력하지 않은 자격증 컨트롤 지우기
		$("input[name=licenseName]").each(function(index) {
			if (!$(this).val()) {
				$(this).closest("p").remove();
			}
		});

		f.action = "/app/member/complete";
		f.submit();

	}
</script>

</head>
<body>

<div class="body-container">
    <div class="body-title">
        <h3><i class="fa-solid fa-user-plus"></i> 회원가입 </h3>
    </div>

    <div>
        <form name="memberForm" method="post">
            <div class="member-form">
            
                <div class="input-session basic-input">
                    <div class="input-title"><h4>기본 입력 사항</h4></div>
                    <div class="input-box">
                        <p>
                            <label>아이디 </label>
                            <input type="text" name="userId" class="form-control" style="width: 82%;" placeholder="아이디 입력">
                        </p> 
        
                        <p>
                            <label>패스워드 </label>
                            <input type="password" name="userPwd" class="form-control" style="width: 82%;" placeholder="패스워드 입력">
                        </p> 

                        <p>
                            <label>이름 </label>
                            <input type="text" name="userName" class="form-control" style="width: 82%;" placeholder="이름 입력">
                        </p> 
                    </div>
                </div>

                <div class="input-session education-input">
                    <div class="input-title"><h4>학력 사항</h4></div>
                    <div class="input-box">
                        <div>
                            <p>
                                 <input type="text" name="schoolName" class="form-control" style="width: 27%;"
                                    placeholder="학교명을 입력하세요">
                                 <input type="date" name="schoolDate1" class="form-control" style="width: 27%;"
                                    placeholder="입학날짜를 입력하세요"> ~ 
                                 <input type="date" name="schoolDate2" class="form-control" style="width: 27%;"
                                    placeholder="졸업날짜를 입력하세요">
                                 <span class="schoolRemoveBtn" style="float: right;"><i class="far fa-minus-square"></i></span>
                            </p>
                        </div>
                        <div style="text-align: center; margin-top: 10px;">
                             <button type="button" class="btn schoolAddBtn">추가</button>
                        </div>
                    </div>
                </div>
         
                <div class="input-session license-input">
                    <div class="input-title"><h4>자격증</h4></div>
                    <div class="input-box">
                        <div>
                            <p>
                                <input type="text" name="licenseName" class="form-control" style="width: 27%;"
                                   placeholder="자격증명을 입력하세요">
                                <input type="date" name="licenseDate" class="form-control" style="width: 27%;"
                                   placeholder="자격증취득날짜를 입력하세요">
                                 <span class="licenseRemoveBtn" style="float: right;"><i class="far fa-minus-square"></i></span>
                            </p>
                        </div>
                        <div style="text-align: center; margin-top: 10px;">
                             <button type="button" class="btn licenseAddBtn">추가</button>
                        </div>
                    </div>
                </div>

                <div class="member-confirm">
                    <button type="button" class="btn" onclick="sendOk();"> 회원가입 </button>
                    <button type="reset" class="btn"> 다시입력 </button>
                    <button type="button" class="btn"> 가입취소 </button>
                </div>

            </div>
        </form>
    </div>  
</div>

</body>
</html>