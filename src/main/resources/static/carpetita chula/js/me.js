$(document).ready(function() {

    cargarMesas();
    $('#contenedor');

});

async function cargarMesas(){

    try{

        const request = await fetch('/carpetita_chula/html/api/Mesas', {
        method: 'GET',
        headers:{
            'Accept': 'application/json',
            'Content-Type': 'application/json'
            }
            //headers: getHeaders()
        });
        const mesas = await request.json();

        

        
        let listadoHTML = '';
        for (let mesa of mesas) {

        let mesaHTML = '<article class="accordion"> <label class="accordion_link"><input type="checkbox">'+
        mesa.titulo+'</label> <div class="accordion_item"> <p>'+
        mesa.contenido+'</p> </div> </article>';

        listadoHTML += mesaHTML;

        }
        
        document.querySelector('#contenedor article').outerHTML = listadoHTML; //modifica la tabla de alumnos
        

    }catch (error){
        console.log(error);
    }

}