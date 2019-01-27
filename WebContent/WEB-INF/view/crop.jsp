<%--
  Created by IntelliJ IDEA.
  User: Khuram Shah
  Date: 1/25/2019
  Time: 9:40 PM
 this page will use to select iamge and crop then save it on server.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>

    <script src="../js/jquery-3.1.0.js"></script>
        <%--<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>--%>
    <%--<script src="../js/jquery.Jcrop.js"></script>--%>
    <link rel="stylesheet" href="css/jquery.Jcrop.css"
          type="text/css" />
    <link rel="stylesheet" href="css/demos.css" type="text/css" />

    <script language="Javascript">

        $(function(){

            $('#cropbox').Jcrop({
                aspectRatio: 1,
                onSelect: updateCoords
            });

        });

        function updateCoords(c)
        {
            $('#x').val(c.x);
            $('#y').val(c.y);
            $('#w').val(c.w);
            $('#h').val(c.h);
        };

        function checkCoords()
        {
            if (parseInt($('#w').val())) return true;
            alert('Please select a crop region then press submit.');
            return false;
        };

    </script>

</head>

<body>

<div id="outer">
    <div class="jcExample">
        <div class="article">

            <h1>Jcrop - Crop Image</h1>

            <!-- This is the image we're attaching Jcrop to -->
            <img src="${pageContext.request.contextPath}/images/abc.jpg" id="cropbox" />

            <!-- This is the form that our event handler fills -->
            <form action="http://localhost:8080/servlet/ImageCrop" method="get"
                  onsubmit="return checkCoords();">
                <input type="hidden" id="x" name="l" />
                <input type="hidden" id="y" name="t" />
                <input type="hidden" id="w" name="w" />
                <input type="hidden" id="h" name="h" />
                <input type="hidden" size="4" id="f" name="f" value="jpg" />
                <input type="hidden" size="4" id="i" name="i"
                       value="abc.jpg"/>
                <input type="submit" value="Crop Image" />
            </form>
        </div>
    </div>
</div>

</body>

</html>
