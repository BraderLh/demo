import React from 'react'

export const Order = (props) => {
  return (
    <>
        <li className="list-group-item">
            <div className='ms-2 me-auto'>
                <div className='fw-bold'>Number-order: {props.numberOrder}</div>
                <p>Final price: {props.finalPrice}</p>
                <p>Date: {props.date}</p>
            </div>
        </li>
    </>
  )
}
