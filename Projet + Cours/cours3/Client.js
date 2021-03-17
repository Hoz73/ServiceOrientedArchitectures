import express from 'express';
require('isomorphic-fetch');

var Products;
async function getJsonProducts(){
    fetch("http://localhost:4000/graphql/",{
        method:'POST',
        headers:{"Content-Type": "application/json"},
        body: JSON.stringify({
            query: `
            {
                products{
                id
                name
                price
                }
            }
            `
        })
    })
    .then(res => res.json())
    .then(data => {
        Products = data.data;
    })
};


function sleep(ms) {
    return new Promise(resolve => setTimeout(resolve, ms));
}



async function main(){
    getJsonProducts();
    await sleep(1000);
    console.log(Products);
} 
const router = express.Router();

main();

router.get('/', (req, res) => {
    //res.send(Products);
    res.send('hello');
});

export default router;





