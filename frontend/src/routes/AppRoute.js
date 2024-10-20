import {
  Navigate,
  Route,
  BrowserRouter as Router,
  Routes,
} from "react-router-dom";
import Login from "../pages/Login";
import NoPage from "../pages/NoPage";
import Register from "../pages/Register";
import Customers from "../pages/sell/Customers";
import Dashboard from "../pages/sell/Dashboard";
import Listings from "../pages/sell/Listings";
import Loyalty from "../pages/sell/Loyalty";
import Orders from "../pages/sell/Orders";
import Programs from "../pages/sell/Programs";
import SellHome from "../pages/sell/SellHome";
import SellLayout from "../pages/sell/SellLayout";
import SellWithUs from "../pages/SellWithUs";
import StoreHome from "../pages/store/StoreHome";
import StoreLayout from "../pages/store/StoreLayout";
import Welcome from "../pages/Welcome";

export default function AppRoute() {
  return (
    <Router>
      <Routes>
        <Route path="/" element=<Navigate to="/welcome" /> />
        <Route path="/welcome" element=<Welcome /> />
        <Route path="/sell-with-us" element=<SellWithUs /> />
        <Route path="/login" element=<Login /> />
        <Route path="/register" element=<Register /> />
        <Route path="/store/" element=<StoreLayout />>
          <Route index element=<StoreHome /> />
        </Route>
        <Route path="/sell/" element=<SellLayout />>
          <Route index element=<SellHome /> />
          <Route path="dashboard" element=<Dashboard /> />
          <Route path="orders" element=<Orders /> />
          <Route path="listings" element=<Listings /> />
          <Route path="programs" element=<Programs /> />
          <Route path="customers" element=<Customers /> />
          <Route path="loyalty" element=<Loyalty /> />
        </Route>
        <Route path="*" element=<NoPage /> />
      </Routes>
    </Router>
  );
}
