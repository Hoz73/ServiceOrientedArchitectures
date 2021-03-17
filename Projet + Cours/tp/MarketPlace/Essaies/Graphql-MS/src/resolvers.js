//import { Product } from "./models/Product";

const Product = require('./models/Product');

export const resolvers = {
    Query: {
        hello: () => "hello",
        products: () => Product.find()
    },

    Mutation: {
        createProduct: async (_,{name, price}) =>{
            var product = new Product({ name, price });
            await product.save();
            console.log(product);
            return product;
        }
    }
};


