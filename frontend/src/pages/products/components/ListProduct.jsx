import React from 'react'
import { Product } from './Product'

export const ListProduct = ({products}) => {
  return (
    <>
        <div className='store'>
            <ol className="list-group">
                {
                    products?.map(product =>  {
                        return (
                            <Product 
                                key={product.id}
                                {...product}
                            />
                        )
                    })
                }
            </ol>
        </div>
        <div>
            <div class="d-grid gap-2 d-md-block">
                <button class="btn btn-primary" type="button">Send</button>
                <button class="btn btn-primary" type="button">Cancel</button>
            </div>
        </div>
    </>
  )
}
