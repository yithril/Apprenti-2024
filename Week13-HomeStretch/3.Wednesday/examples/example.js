// Example: JavaScript Targeting and Manipulation

const headerTitle = document.getElementById('main-header');
headerTitle.style.borderBottom = '4px solid #6200ea';

const subtitles = document.getElementsByClassName('subtitle');
subtitles[0].style.fontSize = '1.5em';

const revealButton = document.querySelector('#reveal-button');
revealButton.addEventListener('click', () => {
    const secretMessage = document.querySelector('#secret-message');
    secretMessage.classList.toggle('hidden');
    if(secretMessage.classList.contains('hidden')){
        revealButton.textContent = "Reveal Message";
    }
    else{
        revealButton.textContent = "Hide Message";
    }

});

const footerItems = document.querySelectorAll('.footer-item');
footerItems.forEach((item) => {
    item.addEventListener('mouseover', () => {
        item.style.color = '#6200ea';
    });
    item.addEventListener('mouseout', () => {
        item.style.color = '#333';
    });
});
