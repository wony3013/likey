<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="//d1p7wdleee1q2z.cloudfront.net/post/search.min.js"></script>

<title>Insert title here</title>
<script type="text/javascript">

/*
 *  목록 가기
 */
function fn_list(){
	location.href="memberList";
}


/*
 * 회원 등록
 */
function fn_save(type) {
	
	if(!validate){
		return false;
	}
	
	var frm = document.memberForm;
	
	
	
	
}

/*
 * 유효성 검사
 */
function validate(){
	
	var frm = document.memberForm;
	
	if(frm.mem_id.value == ""){
		alert("아이디를 입력해 주세요.");
		return false;
	}
	if(frm.mem_pwd.value == "" || frm.mem_pwd_confirm.value == ""){
		alert("비밀번호를 입력해 주세요.");
		return false;
	}else if(){
		alert("비밀번호가 일치하지 않습니다.");
		return false;
	}
	
	
	if(frm.mem_id.value == ""){
		alert(" 을 입력해 주세요.");
		return false;
	}
	if(frm.mem_id.value == ""){
		alert(" 을 입력해 주세요.");
		return false;
	}
	if(frm.mem_id.value == ""){
		alert(" 을 입력해 주세요.");
		return false;
	}
	if(frm.mem_id.value == ""){
		alert(" 을 입력해 주세요.");
		return false;
	}
	
}



/*
 * 우편번호 검색
 */

$(function() {
	
	$("#postcodify_search_button").postcodifyPopUp();
	
	
});

</script>
</head>
<body>

<div class="container">

	<c:if test="${param.type == 'I'}">
		<h2>회원가입</h2>
	</c:if>
	
	<c:if test="${param.type != 'I'}">
		<h2>회원수정</h2>
	</c:if>
	
	<form name="memberForm" method="post">
		
		<table class="table table-bordered">
			<tr>
				<td>아이디</td>
				<td><input type="text" name="mem_id" size="20" value="${member.mem_id}"> 
				<button type="button" class="btn btn-primary" id="btnIdChk" >중복체크</button>
				8~20자 내의 영문,숫자 조합
				<label id="resultMsg" ></label>
				
				</td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type="password" name="mem_pwd" size="20"> 8~20자 내의 영문,숫자 조합</td>
			</tr>
			<tr>
				<td>비밀번호확인</td>
				<td><input type="password" name="mem_pwd_confirm" size="20"> 8~20자 내의 영문,숫자 조합</td>
			</tr>
			<tr>
				<td>이름</td>
				<td><input type="text" name="mem_nickname" size="20" value="${member.mem_nickname}"> 별명을 입력하세요</td>
			</tr>			
			<tr>
				<td>전화번호</td>
				<td><input type="text" name="mem_phone" size="20" value="${member.mem_phone}"> '-' 없이 입력</td>
			</tr>
			<tr>
				<td>이메일</td>
				<td><input type="text" name="mem_email" size="20" value="${member.mem_email}"></td>
			</tr>
			<tr>
				<td>주소</td>
				<td>
					<p><input type="text" class="postcodify_postcode5" name="mem_zipcode" readonly size="6" value="${member.mem_zipcode}">
					<button type="button" class="btn btn-primary" id="postcodify_search_button">우편번호검색</button>
					</p>
					<p><input type="text" class="postcodify_address" name="mem_addr_master" readonly size="50" value="${member.mem_addr_master}"> (도로명주소)</p>
					<p><input type="text" class="postcodify_details" name="mem_addr_detail" size="50" value="${member.mem_addr_detail}"> (상세주소)</p>				
				</td>
			</tr>
			
			<tr>
				<td colspan="2">
				
					<c:if test="${param.type == 'I'}">
						<input type="button" value="가입하기" class="btn btn-default" onclick="fn_save('I')">
					</c:if>
					
					<c:if test="${param.type != 'I'}">
						<input type="button" value="수정하기" class="btn btn-default" onclick="fn_save('U')">
					</c:if>
					
					<input type="reset" value="취소" class="btn btn-default">
					<input type="button" value="목록으로" class="btn btn-default" onclick="fn_list()">
				</td>
			</tr>
			
		
		</table>
		
	</form>

</div>

</body>
</html>