/* import React from 'react'

export default function SegundoComponente() {
  return (
    <div>
       <h1>SegundoComponente</h1> 
    </div>
  )
} */

import React from 'react'

export const SegundoComponente = ({nombre, apellido, info}) => {
  return (
    <div>
    <h1>SegundoComponente</h1>
    <li>
        {nombre} {}{apellido}
    </li>
        <li>{info.lugar}</li>
        <li>{info.gusto}</li>

    </div>
  )
}

