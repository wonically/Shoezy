import {
  Dashboard,
  Discount,
  Inventory,
  Loyalty,
  Person4,
  ShoppingCart,
} from "@mui/icons-material";
import { Box, Button, Divider, Typography } from "@mui/material";
import React from "react";
import { Link } from "react-router-dom";

const SellHome = () => {
  return (
    <>
      <Box sx={{ paddingY: 2 }}>
        <Typography variant="h3">Welcome!</Typography>
      </Box>
      <Box
        width="100%"
        display="flex"
        flexWrap="wrap"
        justifyContent="flex-start"
        rowGap={2}
        columnGap={2}
      >
        <Button
          component={Link}
          to="/sell/dashboard"
          variant="outlined"
          color="content"
          sx={{
            ":hover": {
              borderColor: "transparent",
              color: "#ffffff",
            },
            minWidth: "32%",
          }}
        >
          <Box width="100%">
            <Box
              display="flex"
              flexDirection="row"
              alignItems="center"
              padding={2}
            >
              <Dashboard color="inherit" />
              <Typography variant="h6" color="inherit" paddingLeft={2}>
                Dashboard
              </Typography>
            </Box>
            <Divider sx={{ bgcolor: "inherit" }} />
            <Typography variant="body1" color="inherit" padding={2}>
              See statistics of your shop!
            </Typography>
          </Box>
        </Button>
        <Button
          component={Link}
          to="/sell/orders"
          variant="outlined"
          color="content"
          sx={{
            ":hover": {
              borderColor: "transparent",
              color: "#ffffff",
            },
            minWidth: "32%",
          }}
        >
          <Box width="100%">
            <Box
              display="flex"
              flexDirection="row"
              alignItems="center"
              padding={2}
            >
              <ShoppingCart color="inherit" />
              <Typography variant="h6" color="inherit" paddingLeft={2}>
                Orders
              </Typography>
            </Box>
            <Divider sx={{ bgcolor: "inherit" }} />
            <Typography variant="body1" color="inherit" padding={2}>
              See orders status
            </Typography>
          </Box>
        </Button>
        <Button
          component={Link}
          to="/sell/listings"
          variant="outlined"
          color="content"
          sx={{
            ":hover": {
              borderColor: "transparent",
              color: "#ffffff",
            },
            minWidth: "32%",
          }}
        >
          <Box width="100%">
            <Box
              display="flex"
              flexDirection="row"
              alignItems="center"
              padding={2}
            >
              <Inventory color="inherit" />
              <Typography variant="h6" color="inherit" paddingLeft={2}>
                Listings
              </Typography>
            </Box>
            <Divider sx={{ bgcolor: "inherit" }} />
            <Typography variant="body1" color="inherit" padding={2}>
              See all available listings.
            </Typography>
          </Box>
        </Button>
        <Button
          component={Link}
          to="/sell/programs"
          variant="outlined"
          color="content"
          sx={{
            ":hover": {
              borderColor: "transparent",
              color: "#ffffff",
            },
            minWidth: "32%",
          }}
        >
          <Box width="100%">
            <Box
              display="flex"
              flexDirection="row"
              alignItems="center"
              padding={2}
            >
              <Discount color="inherit" />
              <Typography variant="h6" color="inherit" paddingLeft={2}>
                Programs
              </Typography>
            </Box>
            <Divider sx={{ bgcolor: "inherit" }} />
            <Typography variant="body1" color="inherit" padding={2}>
              See statistics of your shop!
            </Typography>
          </Box>
        </Button>
        <Button
          component={Link}
          to="/sell/customers"
          variant="outlined"
          color="content"
          sx={{
            ":hover": {
              borderColor: "transparent",
              color: "#ffffff",
            },
            minWidth: "32%",
          }}
        >
          <Box width="100%">
            <Box
              display="flex"
              flexDirection="row"
              alignItems="center"
              padding={2}
            >
              <Person4 color="inherit" />
              <Typography variant="h6" color="inherit" paddingLeft={2}>
                Customers
              </Typography>
            </Box>
            <Divider sx={{ bgcolor: "inherit" }} />
            <Typography variant="body1" color="inherit" padding={2}>
              See customers
            </Typography>
          </Box>
        </Button>
        <Button
          component={Link}
          to="/sell/loyalty"
          variant="outlined"
          color="content"
          sx={{
            ":hover": {
              borderColor: "transparent",
              color: "#ffffff",
            },
            minWidth: "32%",
          }}
        >
          <Box width="100%">
            <Box
              display="flex"
              flexDirection="row"
              alignItems="center"
              padding={2}
            >
              <Loyalty color="inherit" />
              <Typography variant="h6" color="inherit" paddingLeft={2}>
                Loyalty
              </Typography>
            </Box>
            <Divider sx={{ bgcolor: "inherit" }} />
            <Typography variant="body1" color="inherit" padding={2}>
              See loyalty
            </Typography>
          </Box>
        </Button>
      </Box>
    </>
  );
};

export default SellHome;
