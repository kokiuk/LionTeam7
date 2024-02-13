function toggleMenu() {
    var menu = document.getElementById('menu');
    menu.classList.toggle('show');
}

// 메뉴 외의 부분을 클릭하면 메뉴를 닫는 이벤트
window.onclick = function(event) {
    var menu = document.getElementById('menu');
    if (!event.target.matches('.toggle-bar') && !event.target.matches('.toggle-bar div')) {
        if (menu.classList.contains('show')) {
            menu.classList.remove('show');
        }
    }
}