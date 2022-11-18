import logo from '../../assets/img/logo.svg';
import './styles.css';
function Header() {
    return(
    <header>
        <div className="dsmeta-logo-container">
            <img src={logo} alt="DSMeta" />
            <h1>DSMeta</h1>
            <p>
              Desenvolvido por
              <br></br>
              <a href="https://github.com/Valossa515/">Felipe Martins, GitHub</a>
              <br></br>
              <a href="https://www.linkedin.com/in/felipe-martins-529a249a/">Felipe Martins, LinkedIn</a>
            </p>
        </div>
    </header>
    )
  }
  
  export default Header;
  