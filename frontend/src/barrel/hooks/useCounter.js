import { useState } from "react"

export const useCounter = (initialValue) => {
    const [counter, setCounter] = useState(initialValue);

    const incrementCounter = (value) => {
        setCounter(counter + 1);
    }
    const decrementCounter = (value) => {
        (counter>0) && setCounter(counter -1)
    }
    return {
        counter,
        incrementCounter,
        decrementCounter
    }
}