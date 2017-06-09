<%-- 
    Document   : contato
    Created on : 23/04/2017, 09:54:43
    Author     : jefferson
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" errorPage="TrataErro.jsp">
        <title>Suporte - Nicegames</title>
        <link rel="stylesheet" href="./css/font-lato.css">
        <link rel="stylesheet" href="./css/main.css">
        <link rel="stylesheet" href="./css/accordion.css">
    </head>
    <body>
        
        <header class="header">
          <div class="wrapper">
            <nav class="menu">
              <a href="http://localhost/nicegames" class="menu-link">Home</a>
              <a href="http://localhost/nicegames/about.php" class="menu-link">Sobre</a>
              <img src="https://github.com/jeffersondanielss/nicegames/blob/master/img/ng.png?raw=true" class="logo" alt="Nicegames" width="100px" />
              <a href="http://localhost/nicegames/shop.php" class="menu-link">Produtos</a>
              <a href="http://localhost/nicegames/contact.php" class="menu-link">Contato</a>
            </nav>

            <div class="header-content">
              <h1 class="section-title">Atendimento quando e como você quiser</h1>
              <p class="header-description">
        Desenhamos o Nicegames para você resolver tudo sozinho. Mas se precisar de ajuda, estamos à disposição como for mais conveniente pra você.</p>
            </div>
          </div>
        </header>

        <div class="wrapper">
            <div class="features">
              <h1 class="section-title">Perguntas?</h1>

              <div class="container">
                <div class="accordion">
                  <dl>
                    <dt>
                      <a href="#accordion1" aria-expanded="false" aria-controls="accordion1" class="accordion-title accordionTitle js-accordionTrigger">First Accordion heading</a>
                    </dt>
                    <dd class="accordion-content accordionItem is-collapsed" id="accordion1" aria-hidden="true">
                      <p>Lorem ipsum dolor sit amet, consectetur <a href="https://www.google.com">Test</a>adipiscing elit. Morbi eu interdum diam. Donec interdum porttitor risus non bibendum. Maecenas sollicitudin eros in quam imperdiet placerat. Cras justo purus, rhoncus nec lobortis ut, iaculis vel ipsum. Donec dignissim arcu nec elit faucibus condimentum. Donec facilisis consectetur enim sit amet varius. Pellentesque justo dui, sodales quis luctus a, iaculis eget mauris. </p>
                      <p>Aliquam dapibus, ante quis fringilla feugiat, mauris risus condimentum massa, at elementum libero quam ac ligula. Pellentesque at rhoncus dolor. Duis porttitor nibh ut lobortis aliquam. Nullam eu dolor venenatis mauris placerat tristique eget id dolor. Quisque blandit adipiscing erat vitae dapibus. Nulla aliquam magna nec elementum tincidunt.</p>
                    </dd>
                    <dt>
                      <a href="#accordion2" aria-expanded="false" aria-controls="accordion2" class="accordion-title accordionTitle js-accordionTrigger">
                        Second Accordion heading</a>
                    </dt>
                    <dd class="accordion-content accordionItem is-collapsed" id="accordion2" aria-hidden="true">
                      <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi eu interdum diam. Donec interdum porttitor risus non bibendum. Maecenas sollicitudin eros in quam imperdiet placerat. Cras justo purus, rhoncus nec lobortis ut, iaculis vel ipsum. Donec dignissim arcu nec elit faucibus condimentum. Donec facilisis consectetur enim sit amet varius. Pellentesque justo dui, sodales quis luctus a, iaculis eget mauris. </p>
                      <p>Aliquam dapibus, ante quis fringilla feugiat, mauris risus condimentum massa, at elementum libero quam ac ligula. Pellentesque at rhoncus dolor. Duis porttitor nibh ut lobortis aliquam. Nullam eu dolor venenatis mauris placerat tristique eget id dolor. Quisque blandit adipiscing erat vitae dapibus. Nulla aliquam magna nec elementum tincidunt.</p>
                    </dd>
                    <dt>
                      <a href="#accordion3" aria-expanded="false" aria-controls="accordion3" class="accordion-title accordionTitle js-accordionTrigger">
                        Third Accordion heading
                      </a>
                    </dt>
                    <dd class="accordion-content accordionItem is-collapsed" id="accordion3" aria-hidden="true">
                      <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi eu interdum diam. Donec interdum porttitor risus non bibendum. Maecenas sollicitudin eros in quam imperdiet placerat. Cras justo purus, rhoncus nec lobortis ut, iaculis vel ipsum. Donec dignissim arcu nec elit faucibus condimentum. Donec facilisis consectetur enim sit amet varius. Pellentesque justo dui, sodales quis luctus a, iaculis eget mauris. </p>
                      <p>Aliquam dapibus, ante quis fringilla feugiat, mauris risus condimentum massa, at elementum libero quam ac ligula. Pellentesque at rhoncus dolor. Duis porttitor nibh ut lobortis aliquam. Nullam eu dolor venenatis mauris placerat tristique eget id dolor. Quisque blandit adipiscing erat vitae dapibus. Nulla aliquam magna nec elementum tincidunt.</p>
                    </dd>
                  </dl>
                </div>
              </div>
            </div>
          </div>

        <div class="contact">
          <div class="wrapper">
            <h1 class="section-title">Contato</h1>
            
            <form action="Controller" method="POST">
                <input type="hidden" name="flag" value="contact">

                <label class="contact-label">Email</label>
                <input type="text" class="contact-input"  name="email">

                <label class="contact-label">Senha</label>
                <input type="text" class="contact-input"  name="password">

                <label class="contact-label">Subject</label>
                <select name="subject" class="contact-input" >
                    <option value="reclamacao">Reclamação</option>
                    <option value="sugestao">Sugestão</option>
                    <option value="elogio">Elogio</option>
                </select>

                <label class="contact-label">Mensagem</label>
                <textarea rows="10" name="message" class="contact-input contact-message" ></textarea>

                <input type="submit" class="contact-button" value="ENVIAR">
            </form>
          </div>
        </div>

        <footer class="footer">
          <div class="wrapper">nicegames ©</div>
        </footer>
        <script src="./scripts/main.js"></script>
    </body>
</html>
