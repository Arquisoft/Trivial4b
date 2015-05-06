function createAJAX() {
    // Este es el trozo de codigo para usar AJAX
    var xmlhttp;
    if (window.XMLHttpRequest) { // code for IE7+, Firefox, Chrome, Opera, Safari
        xmlhttp = new XMLHttpRequest();
    }
    else { // code for IE6, IE5
        xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
    }

    return xmlhttp;
}

function executeAJAX(xmlhttp, method, url) {
    // Aqui abro la conexion con la llamada REST
    xmlhttp.open(method, url, true);

    // Envio la peticion GET
    xmlhttp.send();
}