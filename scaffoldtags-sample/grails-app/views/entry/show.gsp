<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="layout" content="no-img-skin" />
         <link rel="stylesheet" href="${createLinkTo(dir:'css',file:'sample.css')}" />
        <title>Show Entry</title>
    </head>
    <body>
        <div class="body">
            <div class="titleSection">
                <h1 class="title">Show Entry</h1>
                <div class="pageActions">
                    <span class="actionButton"><g:link action="list">Back to List</g:link></span>
                </div>
            </div>
            <g:if test="${flash.message}">
                 <div class="message">${flash.message}</div>
            </g:if>
            <g:if test="${entryInstance}">
                <g:renderDomain domain="${Entry.class}" 
                                template="show" 
                                value="${entryInstance}" 
                                style="[actions:[[edit: 'Edit'], [delete: 'Delete']] ]"/>
            </g:if>
            <textarea class="codeShare"><g:showGSP view="show"/></textarea>
        </div>
    </body>
</html>
