$(document).ready(function() {

  cargarNovedades();
  $('#contenedor');

});

async function cargarNovedades(){

  try{

    const request = await fetch('/carpetita_chula/html/api/Nov', {
      method: 'GET',
      headers:{
        'Accept': 'application/json',
        'Content-Type': 'application/json'
        }
        //headers: getHeaders()
    });
    const novedades = await request.json();

    

      
    let listadoHTML = '';
    for (let novedad of novedades) {

      let novedadHTML = '<article class="accordion"> <label class="accordion_link"><input type="checkbox">'+
      novedad.titulo+'</label> <div class="accordion_item"> <p>'+
      novedad.contenido+'</p> </div> </article> ';

      listadoHTML += novedadHTML;

    }
      
    document.querySelector('#contenedor article').outerHTML = listadoHTML; //modifica la tabla de alumnos
    

  }catch (error){
    console.log(error);
  }

}


document.getElementById('agregarCaja').addEventListener('click', function() {
    const crearcajas = createElement("div");
  });