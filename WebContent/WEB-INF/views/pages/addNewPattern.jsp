<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

${message}
<form:form method="POST" action="${pageContext.request.contextPath}/addNewPattern" modelAttribute="pattern">
	<div class="form-group">
		<form:label path="name" >Name</form:label>
		<form:input path="name" class="form-control"/>
	</div>
	<div class="form-group">
		<form:label path="pgroup" >Group</form:label>
		<form:input path="pgroup" class="form-control"/>
	</div>
	<div class="form-group">
		<form:label path="implementation" >Implementation</form:label>
		<form:input path="implementation" class="form-control"/>
	</div>
	<button type="submit" class="btn btn-default">Save</button>
</form:form>