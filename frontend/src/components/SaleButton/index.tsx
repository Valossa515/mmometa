import axios from "axios";
import { useState } from "react";
import { toast } from "react-toastify";
import addicon from '../../assets/img/add-icon.svg'
import { BASE_URL } from "../../utils/request";
import './styles.css';



function handleClick(){
    alert("Teste!")
}

function SaleButton(){
    const [isHovering, setIsHovering] = useState(false);

    const handleMouseOver = () => {
        setIsHovering(true);
      };
    
      const handleMouseOut = () => {
        setIsHovering(false);
      };

    return(
        <div className="dsmeta-red-btn" onClick={() => handleClick()} 
        onMouseOver={handleMouseOver} onMouseOut={handleMouseOut}>
            <img src={addicon} />
            {isHovering &&
            <div>
                <p>Adcionar Venda</p>
            </div>
            }
            
        </div>
    )
}
 export default SaleButton;