import React, { useState } from 'react';

const todo = props => {
    const inputState = useState(''); //returns an array

    return <React.Fragment>
        <input type="text" placeholder="Todo" />
        <button type="button">Add</button>
        <ul>

        </ul>
    </React.Fragment>
}

export default todo;