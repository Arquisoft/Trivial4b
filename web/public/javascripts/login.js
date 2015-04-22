function login() {
    // 
    var xmlhttp = createAJAX();

    // Esto es lo que ejecutará la llamada AJAX cuando termine
    xmlhttp.onreadystatechange = function () {
        if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
            // Recojo la respuesta de AXAJ, en este caso el json de una pregunta alatoria de historia
            document.getElementById("result").innerHTML = xmlhttp.responseText;
        }
    }

    executeAJAX(xmlhttp, "POST", "http://localhost:9000/usuarios/save/prueba/prueba");
}