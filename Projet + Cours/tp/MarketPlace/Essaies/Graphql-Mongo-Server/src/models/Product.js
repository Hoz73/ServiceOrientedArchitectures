
const mongoose = require('mongoose');
const Schema = mongoose.Schema;

const ProductSchema = new Schema({
    name: String,
    price: String,
});

const Product = mongoose.model('Products', ProductSchema);

module.exports = Product;

