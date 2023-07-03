const menuBtn = document.querySelector('.menu-btn');
const menuResponsive = document.querySelector('.menu-responsive');

menuBtn.addEventListener('click', () => {
  menuResponsive.classList.toggle('active');
});