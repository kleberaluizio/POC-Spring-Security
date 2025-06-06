package com.security.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/public")
    public String publicMethod() {
        return "<h1>Public route, feel free to explore!</h1>";
    }

    @GetMapping("/public/html")
    public String publicMethod2() {
        return "<!DOCTYPE html>\n" +
                "<html lang=\"pt-br\">\n" +
                "<head>\n" +
                "  <meta charset=\"UTF-8\" />\n" +
                "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n" +
                "  <title>Página de Teste</title>\n" +
                "  <style>\n" +
                "    * {\n" +
                "      box-sizing: border-box;\n" +
                "      margin: 0;\n" +
                "      padding: 0;\n" +
                "    }\n" +
                "\n" +
                "    body {\n" +
                "      font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;\n" +
                "      background: linear-gradient(to right, #00c6ff, #0072ff);\n" +
                "      color: #333;\n" +
                "      display: flex;\n" +
                "      justify-content: center;\n" +
                "      align-items: center;\n" +
                "      height: 100vh;\n" +
                "    }\n" +
                "\n" +
                "    .card {\n" +
                "      background-color: white;\n" +
                "      padding: 2rem;\n" +
                "      border-radius: 16px;\n" +
                "      box-shadow: 0 8px 20px rgba(0, 0, 0, 0.2);\n" +
                "      max-width: 400px;\n" +
                "      width: 100%;\n" +
                "      text-align: center;\n" +
                "      transition: transform 0.2s ease;\n" +
                "    }\n" +
                "\n" +
                "    .card:hover {\n" +
                "      transform: scale(1.03);\n" +
                "    }\n" +
                "\n" +
                "    h1 {\n" +
                "      color: #0072ff;\n" +
                "      margin-bottom: 1rem;\n" +
                "    }\n" +
                "\n" +
                "    p {\n" +
                "      margin-bottom: 1.5rem;\n" +
                "    }\n" +
                "\n" +
                "    button {\n" +
                "      background-color: #0072ff;\n" +
                "      color: white;\n" +
                "      border: none;\n" +
                "      padding: 0.75rem 1.5rem;\n" +
                "      border-radius: 8px;\n" +
                "      font-size: 1rem;\n" +
                "      cursor: pointer;\n" +
                "      transition: background-color 0.3s ease;\n" +
                "    }\n" +
                "\n" +
                "    button:hover {\n" +
                "      background-color: #005fcc;\n" +
                "    }\n" +
                "  </style>\n" +
                "</head>\n" +
                "<body>\n" +
                "  <div class=\"card\">\n" +
                "    <h1>Olá, mundo!</h1>\n" +
                "    <p>Essa é uma página HTML de teste, com um design simples e moderno.</p>\n" +
                "    <button onclick=\"alert('Você clicou!')\">Clique aqui</button>\n" +
                "  </div>\n" +
                "</body>\n" +
                "</html>";
    }

    @GetMapping("/private")
    public String privateMethod() {
        return "<h1>Private route, limited access!</h1>";
    }
}
