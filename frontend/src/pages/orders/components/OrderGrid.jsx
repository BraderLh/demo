import React from 'react'
import { useFetch } from '../../../barrel';
import { MyNavBar } from '../../../components/MyNavBar'
import { ListOrder } from './ListOrder';
import { LoadingOrder } from './LoadingOrder';

export const OrderGrid = () => {
  
  const {data: orders, isLoading} = useFetch('http://localhost:8080/api/orders');

  return (
    <>
      <h1>Orders</h1>
      <MyNavBar />
      {
          (isLoading) 
              ? <LoadingOrder />
              : <ListOrder orders={orders} /> 
      }
    </>
  )
}
