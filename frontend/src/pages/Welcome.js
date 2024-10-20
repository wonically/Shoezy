import { Box, Button, Typography } from "@mui/material";
import React from "react";

const Welcome = () => {
  return (
    <Box
      sx={{
        "&::before": {
          content: '""',
          position: "absolute",
          top: 0,
          left: 0,
          width: "100%",
          height: "100%",
          backgroundColor: "rgba(0, 0, 0, 0.5)", // Adjust the opacity (0.5 = 50% opacity)
          zIndex: -1,
        },
        height: "100%",
        width: "100%",
        position: "fixed",
        margin: 0,
        backgroundImage:
          "url(https://variety.com/wp-content/uploads/2022/07/AdobeStock_241431868.jpeg)",
        backgroundPosition: "center",
        backgroundSize: "cover",
        display: "flex",
        alignItems: "center",
        justifyContent: "space-evenly",
        flexDirection: "column",
      }}
    >
      <Typography variant="h3" color="primary.contrastText">
        Welcome to Shoezy
      </Typography>
      <Box
        sx={{
          display: "flex",
          alignItems: "center",
          justifyContent: "space-evenly",
          width: "50%",
          minWidth: "125",
        }}
      >
        <Button
          size="large"
          href="/store"
          sx={{
            background: "transparent",
            textDecoration: "underline",
            textDecorationThickness: 2,
            textUnderlineOffset: 10,
            padding: 2,
            "&:hover": {
              textDecoration: "none",
              background: "primary",
            },
          }}
        >
          <Typography variant="h5" color="primary.contrastText">
            STORE
          </Typography>
        </Button>
        <Button
          size="large"
          href="/sell"
          sx={{
            background: "transparent",
            textDecoration: "underline",
            textDecorationThickness: 2,
            textUnderlineOffset: 10,
            padding: 2,
            "&:hover": {
              textDecoration: "none",
              background: "primary",
            },
          }}
        >
          <Typography variant="h5" color="primary.contrastText">
            FOR SELLERS
          </Typography>
        </Button>
      </Box>
    </Box>
  );
};

export default Welcome;
