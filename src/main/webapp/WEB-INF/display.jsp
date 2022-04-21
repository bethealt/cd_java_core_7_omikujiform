<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>Show OmiKuji Result</title>
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- for application CSS and JS-->
        <link rel="stylesheet" type="text/css" href="/css/style.css">
        <script type="text/javascript" src=""></script>
        <!-- for Bootstrap CSS -->
        <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
        <!-- For Bootstrap that uses JS or jQuery-->
        <script src="/webjars/jquery/jquery.min.js"></script>
        <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    </head>
    <body>
        <h1>Here's Your Omikuji!</h1>
        <div class="container">
            <p>
                In <c:out value="${random}"></c:out> years,
                you will live in <c:out value="${city}"></c:out> <br>
                with <c:out value="${name}"></c:out> as your roommate, <br>
                <c:out value="${hobby}"></c:out> for a living. <br>
                 The next time you see a <c:out value="${living}"></c:out>, you will have good luck.  <br>
                 Also, <c:out value="${nice}"></c:out>.
            </p>
            <a href="/omikuji"><input type="submit" class="btn btn-danger" id="send" value="Go Back"></a>
        </div>
    </body>
</html>