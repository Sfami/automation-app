async function runTests() {

    fetch('http://localhost:9090/', {
        method: 'GET', // *GET, POST, PUT, DELETE, etc.
        mode: 'cors', // no-cors, *cors, same-origin
        cache: 'no-cache', // *default, no-cache, reload, force-cache, only-if-cached
        credentials: 'same-origin', // include, *same-origin, omit
        headers: {
            'Content-Type': 'application/json',
        },
        redirect: 'follow', // manual, *follow, error
        referrerPolicy: 'no-referrer', // no-referrer, *no-referrer-when-downgrade, origin, origin-when-cross-origin, same-origin, strict-origin, strict-origin-when-cross-origin, unsafe-url
        // body: JSON.stringify(data) // body data type must match "Content-Type" header
    })
        .then((response) => response.json())
        .then((data) => {
            // TODO: Return an <a></a> element for viewing results if successful,
            // otherwise leave empty space
            console.log(data);
        })
        .catch((error) => {
            console.log(data);
            console.error('Error:', error);
        });
}

function onClick() {
    
    console.log();
}