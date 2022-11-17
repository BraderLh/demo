import React from 'react'
import ReactDOM from 'react-dom/client'
import { MyNavBar } from '../../components/MyNavBar'
import '../../index.css'
import { ProductGrid } from './components/ProductGrid';

ReactDOM.createRoot(document.getElementById('root')).render(
  <React.StrictMode>
    <ProductGrid />
  </React.StrictMode>
);