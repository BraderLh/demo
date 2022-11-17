import React from 'react'
import { useCounter } from '../../../barrel';

export const Product = (props) => {

  const {counter, incrementCounter, decrementCounter} = useCounter(0);

  return (
    <>
        <li className="list-group-item">
            <div className='ms-2 me-auto'>
                <img src='' alt='' />
                <div className='fw-bold'>Product id: {props.id}</div>
                <p>Name: {props.name}</p>
                <p>Price: {props.unitPrice}</p>
                <p>Quantity: {counter}</p>
            </div>
            <button onClick={() => incrementCounter(counter)}>+1</button>
            <button onClick={() => decrementCounter(counter)}>-1</button>
        </li>
    </>
  )
}
