<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html><html lang="vi"><head><meta charset="UTF-8"><title>Chuyển đổi USD sang VNĐ</title></head><body>
<h1>Chuyển đổi USD sang VNĐ</h1>
<form action="convert" method="post">
<label for="rate">Tỉ giá (VND/USD):</label><input id="rate" type="number" name="rate" value="25000" step="any" required><br>
<label for="usd">Lượng USD:</label><input id="usd" type="number" name="usd" step="any" required><br>
<button type="submit">Chuyển đổi</button>
</form></body></html>
