import React from 'react'
import { MyBody } from './components/MyBody';
import { MyNavBar } from './components/MyNavBar';



export const App = () => {
  return (
    <>
        <h1>Blaze store</h1>
        <hr></hr>
        <div>
            <MyNavBar />
        </div>     
        <MyBody />
    </>

  )
}
