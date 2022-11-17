import React from 'react'
import { Order } from './Order'

export const ListOrder = ({orders}) => {
  return (
    <>
        <div className='store'>
            <ol className="list-group list-group-numbered">
                {
                    orders?.map(order =>  {
                        return (
                            <Order 
                                key={order.id}
                                {...order}
                            />
                        )
                    })
                }
            </ol>
        </div>
    </>
  )
}
