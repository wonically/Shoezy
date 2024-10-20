import { createTheme } from "@mui/material/styles";

export default createTheme({
  palette: {
    mode: "light",
    primary: {
      dark: "#97a97c",
      darker: "#87986a",
      darkest: "#718355",
      main: "#b5c99a",
      light: "#cfe1b9",
      lighter: "#e9f5db",
      contrastText: "#ffffff",
    },
    secondary: {
      main: "#FBEEEB",
    },
    success: {
      main: "#93c47d",
    },
    error: {
      main: "#e06666",
    },
    warning: {
      main: "#FFD966",
    },
    info: {
      main: "#CC8FFD",
    },
    content: {
      main: "#373737",
    },
  },
  typography: {
    fontFamily: "DM Sans",
    fontWeightLight: 200,
    fontWeightRegular: 300,
    fontWeightMedium: 400,
    fontWeightBold: 500,
    allVariants: {
      color: "#373737",
    },
  },
  shadows: Array(25).fill("none"),
  components: {
    MuiButtonBase: {
      defaultProps: { disableRipple: true },
    },
    MuiButton: {
      defaultProps: {
        size: "small",
        variant: "contained",
        color: "primary",
      },
      styleOverrides: {
        root: {
          textTransform: "none",
          borderRadius: 0,
          padding: 0,
          "&:hover": { background: "#97a97c" },
        },
      },
    },
    MuiIconButton: {
      defaultProps: {
        size: "small",
      },
      styleOverrides: {
        root: {
          borderRadius: 0,
          padding: 0,
          "&:hover": { background: "#97a97c" },
        },
      },
    },
    MuiListItemButton: {
      styleOverrides: {
        root: {
          borderRadius: 0,
          padding: 0,
          "&.Mui-selected": {
            backgroundColor: "#cfe1b9",
          },
          "&:hover": { background: "#97a97c" },
        },
      },
    },
    MuiSvgIcon: {
      defaultProps: {
        color: "content",
      },
    },
    MuiListItemIcon: {
      defaultProps: {
        color: "content",
      },
    },
    MuiLink: {
      defaultProps: {
        underline: "none",
      },
    },
  },
});
