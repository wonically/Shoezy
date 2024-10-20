import { ThemeProvider } from "@mui/material";
import theme from "./ThemeOptions";
import AppRoute from "./routes/AppRoute";

function App() {
  return (
    <ThemeProvider theme={theme}>
      <AppRoute />
    </ThemeProvider>
  );
}

export default App;
