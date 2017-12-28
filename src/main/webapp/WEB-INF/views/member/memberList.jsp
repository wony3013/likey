<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.css">
<title>Insert title here</title>
<script type="text/javascript">

function fn_form(){
	location.href="memberForm?type=I";	
}

</script>

</head>
<body>

	<div class="container ">
		<h2>회원목록</h2>
		<!-- 검색폼 -->
		<form class="form-inline" name="searchForm" action="memberList" method="post">
			<div class="form-group">
			<input type="hidden" name="currentPage" value="${param.currentPage}">
			<select name="searchType" class="form-control">
				<option value="">전체</option>
				<option value="id" ${param.searchType == 'id' ? 'selected' : ''}>아이디</option>
				<option value="nickname" ${param.searchType == 'nickname' ? 'selected' : ''}>닉네</option>
			</select>
			
			</div>
			<div class="form-group">
			<input type="text" name="searchWord" value="${param.searchWord}" class="form-control">
			</div>
			<div class="form-group">
			<input type="button" value="검색" onclick="fn_search(1)" class="form-control">
			</div>
			<%-- <p>
				<div class="form-group">
					<label>총 회원수 : ${pagingUtil.totalCount} </label>
				</div>
				<div class="form-group" style="float: right;">
				 	<label>페이지 사이즈 :</label>
				 	<select name="pageSize" class="form-control">
				 		<option ${param.pageSize == '10' ? 'selected' : '' } value="10">10</option>
				 		<option ${param.pageSize == '20' ? 'selected' : '' } value="20">20</option>
				 		<option ${param.pageSize == '50' ? 'selected' : '' } value="50">50</option>
				 	</select>
				</div>
			</p> --%>
		</form>
		<!-- //검색폼 -->
		
		<p align="right"><input type="button" class="btn-default" value="회원가입" onclick="fn_form()"></p>
		
		<table class="table table-striped table-bordered table-hover">
			<thead>
				<tr>
					<th>아이디</th>
					<th>닉네임</th>
					<th>전화번호</th>
					<th>이메일</th>
					<th>가입일자</th>
				</tr>
			</thead>
			<tbody>
			
			<c:if test="${!empty memberList}">
				<c:forEach var="member" items="${memberList}">
					<c:url var="viewUrl" value="memberView">
						<c:param name="mem_id" value="${member.mem_id}" />
					</c:url>
					
					<tr>
						<td>${member.mem_id}</td>
						<td><a href="${viewUrl}">${member.mem_nickname}</a></td>
						<td>${member.mem_phone}</td>
						<td>${member.mem_email}</td>
						<td>${member.reg_date}</td>
					</tr>
				</c:forEach>
			</c:if>
			<c:if test="${empty memberList}">
				<tr><td colspan="5" align="center">조회된 결과가 없습니다.</td></tr>
			</c:if>
			</tbody>
		</table>
		<%-- <div style="text-align: center;">
			<ul class="pagination">
				${pagingUtil.pageHtml}
			</ul>
		</div> --%>
	</div>

</body>
</html>