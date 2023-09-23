import './App.css'
import FooterComponents from './components/FooterComponents'
import HeaderComponent from './components/HeaderComponent'
import ListEmployeeComponenets from './components/ListEmployeeComponenets'
import { BrowserRouter,Routes ,Route} from 'react-router-dom'
import EmployeeComponent from './components/EmployeeComponent'
import ListDepartmentComponent from './components/ListDepartmentComponent'
import DepartmentComponent from './components/DepartmentComponent'
function App() {


  return (
    <>
    <BrowserRouter>
       <HeaderComponent />
       <Routes>
        {/* // https://localhost:3000 */}
        <Route path = '/' element = { <ListEmployeeComponenets/> }></Route>
        {/* // https://localhost:3000/employees */}
        <Route path='/employees' element = {<ListEmployeeComponenets />}></Route>
         {/* // https://localhost:3000/add-employee */}
        <Route path ='/add-employee' element = {<EmployeeComponent />}></Route>
        {/* // https://localhost:3000/add-employee/1 */}
        <Route path='/edit-employee/:id' element = {<EmployeeComponent />}></Route>

        {/* // https://localhost:3000/departments */}
        <Route path ='/departments' element = {<ListDepartmentComponent />}></Route>
        {/* // https://localhost:3000/add-department */}
        <Route path ='/add-department' element = {<DepartmentComponent/>}></Route>
        {/* // https://localhost:3000/edit-department/1 */}
        <Route path='/edit-department/:id' element = {<DepartmentComponent />}></Route>


       </Routes>
       <FooterComponents />
    </BrowserRouter>
     
    </>
  )
}

export default App
