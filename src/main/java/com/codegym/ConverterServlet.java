package com.codegym;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ConverterServlet", urlPatterns = "/convert")
public class ConverterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            try {
                double rate = Double.parseDouble(request.getParameter("rate"));
                double usd = Double.parseDouble(request.getParameter("usd"));
                double vnd = rate * usd;
                out.println("<!DOCTYPE html><html lang='vi'><head><meta charset='UTF-8'><title>Kết quả</title></head><body>");
                out.println("<h1>Kết quả chuyển đổi</h1>");
                out.printf("<p>Tỉ giá: %.2f VND/USD</p>%n<p>Lượng USD: %.2f USD</p>%n<h2>Thành tiền VNĐ: %.2f VNĐ</h2>%n", rate, usd, vnd);
                out.println("<a href='index.jsp'>Quay lại</a></body></html>");
            } catch (NumberFormatException | NullPointerException e) {
                out.println("<h2>Lỗi: Vui lòng nhập số hợp lệ.</h2><a href='index.jsp'>Quay lại</a>");
            }
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.sendRedirect("index.jsp");
    }
}
