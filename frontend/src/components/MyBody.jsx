import React from 'react';
import pipes from '../images/Pipes.jpg';
import medicines from '../images/Medicines.jpg';
import doctor from '../images/DoctorWeed.jpg';

export const MyBody = () => {
  return (
    <>
        <div className='custom-slide'>
            <div id="carouselExampleIndicators" className="carousel slide" data-bs-ride="true">
                <div className="carousel-indicators">
                    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="0" className="active" aria-current="true" aria-label="Slide 1"></button>
                    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="1" aria-label="Slide 2"></button>
                    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="2" aria-label="Slide 3"></button>
                </div>
                <div className="carousel-inner">
                    <div className="carousel-item active">
                    <img src={pipes} className="d-block w-100 mx-auto" alt="products" />
                    </div>
                    <div className="carousel-item">
                    <img src={medicines} className="d-block w-100 mx-auto" alt="information"/>
                    </div>
                    <div className="carousel-item">
                    <img src={doctor} className="d-block w-100 mx-auto" alt="orders"/>
                    </div>
                </div>
                <button className="carousel-control-prev" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="prev">
                    <span className="carousel-control-prev-icon" aria-hidden="true"></span>
                    <span className="visually-hidden">Previous</span>
                </button>
                <button className="carousel-control-next" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="next">
                    <span className="carousel-control-next-icon" aria-hidden="true"></span>
                    <span className="visually-hidden">Next</span>
                </button>
            </div>
        </div>
    </>
    )
}
