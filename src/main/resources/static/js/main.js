const usernameInput = document.getElementById('username');
const passwordInput = document.getElementById('password');

usernameInput.addEventListener('input', () => {
    if (usernameInput.value.trim() === '') {
        usernameInput.setCustomValidity('Username is required!');
    } else {
        usernameInput.setCustomValidity('');
    }
});

passwordInput.addEventListener('input', () => {
    if (passwordInput.value.trim() === '') {
        passwordInput.setCustomValidity('Password is required!');
    } 
    else {
        passwordInput.setCustomValidity('');
    }
});