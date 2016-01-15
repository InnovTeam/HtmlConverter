<%@ taglib uri="/struts-tags" prefix="s"%>
<html lang="en">
<head>
<#list styles as style>
    ${style}
</#list>
</head>

<body>
 ${body}
<#list javascripts as javascript>
    ${javascript}
</#list>
</body>
</html>
