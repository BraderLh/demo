import React from 'react'
import { useFetch } from '../../../barrel';
import { MyNavBar } from '../../../components/MyNavBar';
import { ListProduct } from './ListProduct';
import { LoadingProduct } from './LoadingProduct';

export const ProductGrid = () => {

    const {data: products, isLoading} = useFetch('http://localhost:8080/api/products');

  return (
    <>
        <h1>Products</h1>
        <MyNavBar/>
        {
            (isLoading) 
                ? <LoadingProduct />
                : <ListProduct products={products} /> 

        }
    </>
  )
}
