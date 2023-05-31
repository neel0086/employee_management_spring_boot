import React from 'react'
import {
  HashRouter as Router,
  Route, Routes
} from 'react-router-dom';
import Navbar from './components/Navbar';
import AddEmployee from './components/AddEmployee';
function App() {
  return (
      <div className="App text-Roboto h-screen overflow-hidden bg-gradient-to-tr from-neutral-700 via-gray-800 to-neutral-900">

        <Router>
          <Navbar />
          <Routes>
            <Route path='/' element={<AddEmployee />} />
            {/* <Route path='/rate_calculator' element={<Calculator />} />
            <Route path='/data_search' element={<DataSearch />} /> */}



            {/* <Route path='/loading' element={<Loading />} /> */}
          </Routes>
          {/* <Footer /> */}
        </Router>

      </div>
  )
}

export default App
