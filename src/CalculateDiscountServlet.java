import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

@WebServlet(name = "CalculateDiscountServlet", urlPatterns = "/display-discount")
public class CalculateDiscountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String productDescription = request.getParameter("Product Description: ");
        double listPrice =  Double.parseDouble(request.getParameter("List Price: "));

        TreeMap<String, Double> discountLists = new TreeMap<>();
        discountLists.put("product1", 5.5);
        discountLists.put("product2", 10.0);
        discountLists.put("product3", 15.0);
        discountLists.put("product4", 3.0);
        discountLists.put("product5", 6.0);

        double discountPercent = 0;

        if (discountLists.containsKey(productDescription)) {
            discountPercent = discountLists.get(productDescription);
        }

        double discountAmount = listPrice * discountPercent * 0.01;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>Product Description: " + productDescription + "</h1>");
        writer.println("<h1>List Price: " + listPrice + "</h1>");
        writer.println("<h1>Discount Amount: " + discountAmount + "</h1>");
        writer.println("<h1>Discount Price: " + (listPrice - discountAmount) + "</h1>");
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
