const barra = document.querySelector('.barra');

    window.addEventListener('scroll', function(){
        barra.classList.toggle('active', window.scrollY >0)
    })