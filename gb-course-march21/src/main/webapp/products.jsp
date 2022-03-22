<%@ page import = "ru.alexanna.servlet.model.Product" %>
<%@ page import = "java.util.List" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Products</title>
    </head>
    <body>
        <h1>Product list</h1>
        <p>Product type: ${product.title}</p>
        <hr>
            <ul>
                <% if (((Product)request.getAttribute("product")).getProducts() != null) %>
                <% for (Product product : (List<Product>) ((Product)request.getAttribute("product")).getProducts()) { %>
                <li> title: <%=product.getTitle()%>;    cost: <%=product.getCost()%>; product id: <%=product.getId()%> </li>
                <% } %>
            </ul>
        </hr>
    </body>
</html>
