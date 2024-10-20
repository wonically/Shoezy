import { ShoppingBasketOutlined } from "@mui/icons-material";
import {
  AppBar,
  Avatar,
  Badge,
  Box,
  Button,
  Divider,
  IconButton,
  Stack,
  Toolbar,
  Typography,
  styled,
} from "@mui/material";
import React from "react";
import { Outlet } from "react-router-dom";

const BarHeader = styled("div")(({ theme }) => ({
  display: "flex",
  alignItems: "center",
  justifyContent: "space-between",
  padding: theme.spacing(0, 1),
  // necessary for content to be below app bar
  ...theme.mixins.toolbar,
}));

const StoreLayout = () => {
  return (
    <Box sx={{ display: "flex" }}>
      <AppBar position="fixed">
        <Toolbar
          sx={{ alignItems: "stretch", justifyContent: "space-between" }}
        >
          <Typography
            component={Button}
            sx={{
              alignSelf: "center",
              background: "transparent",
              "&:hover": { background: "transparent" },
            }}
            href="/"
            disableRipple
            variant="h6"
            noWrap
          >
            Shoezy
          </Typography>
          <Stack direction="row">
            <Button sx={{ height: "100%" }}>
              <Typography paddingX={2}>ALL</Typography>
            </Button>
            <Divider
              orientation="vertical"
              sx={{ height: "50%", alignSelf: "center" }}
            />
            <Button sx={{ height: "100%" }}>
              <Typography paddingX={2}>COLLECTION</Typography>
            </Button>
            <Divider
              orientation="vertical"
              sx={{ height: "50%", alignSelf: "center" }}
            />
            <Button sx={{ height: "100%" }}>
              <Typography paddingX={2}>OCCASION</Typography>
            </Button>
            <Divider
              orientation="vertical"
              sx={{ height: "50%", alignSelf: "center" }}
            />
            <Button sx={{ height: "100%" }}>
              <Typography paddingX={2}>BRAND</Typography>
            </Button>
          </Stack>
          <Box
            width="25%"
            maxWidth={125}
            display="flex"
            flexDirection="row"
            justifyContent="space-between"
          >
            <IconButton sx={{ height: "100%", paddingX: 2 }}>
              <Badge badgeContent={1} color="info">
                <ShoppingBasketOutlined />
              </Badge>
            </IconButton>
            <Avatar sx={{ alignSelf: "center" }} />
          </Box>
        </Toolbar>
      </AppBar>
      <Box component="main" sx={{ flexGrow: 1, p: 3 }}>
        <BarHeader />
        <Outlet />
      </Box>
    </Box>
  );
};

export default StoreLayout;
