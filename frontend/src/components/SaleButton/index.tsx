import axios from "axios";
import { toast } from "react-toastify";
import addicon from '../../assets/img/add-icon.svg'
import { BASE_URL } from "../../utils/request";
import './styles.css';



function handleClick(){
    alert("Teste!")
}

function SaleButton(){
    return(
        <div className="dsmeta-red-btn" onClick={() => handleClick()}>
            <img src={addicon} alt="Adcionar venda!" /> 
        </div>
    )
}
 export default SaleButton;