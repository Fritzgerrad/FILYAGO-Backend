document.getElementById('userRegistrationForm').addEventListener('submit', function(event) {
    event.preventDefault();

    const user = {
        firstname: document.getElementById('firstname').value,
        lastname: document.getElementById('lastname').value,
        username: document.getElementById('username').value,
        password: document.getElementById('password').value,
        email: document.getElementById('email').value,
        age: parseInt(document.getElementById('age').value),
        gender: document.getElementById('gender').value,
        nationality: document.getElementById('nationality').value,
        noOfClothsSewn: parseInt(document.getElementById('noOfClothsSewn').value),
        address: document.getElementById('address').value,
        rating: parseFloat(document.getElementById('rating').value),
        activation_code: document.getElementById('activationCode').value,
        phone: document.getElementById('phone').value,
        account_number: document.getElementById('accountNumber').value,
        created_at: document.getElementById('createdAt').value,
    };

    // Make an API call to send the user data to the backend
    fetch('/api/registerUser', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(user)
    })
        .then(response => {
            if (response.ok) {
                alert('User registered successfully!');
                // You can perform further actions here if needed
            } else {
                alert('Failed to register user.');
            }
        })
        .catch(error => {
            alert('An error occurred: ' + error.message);
        });
});
