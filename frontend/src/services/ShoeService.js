import axios from "axios";

const BASE_URL = "http://localhost:8080/shoe";

export const createCountry = async (country) => {
  try {
    const response = await axios.post(`${BASE_URL}/country/create`, country);
    return response.data.result;
  } catch (error) {
    throw error;
  }
};

export const updateCountry = async (code, country) => {
  try {
    const response = await axios.put(
      `${BASE_URL}/country/update/${code}`,
      country
    );
    return response.data.result;
  } catch (error) {
    throw error;
  }
};

export const getCountry = async (code) => {
  try {
    const response = await axios.get(`${BASE_URL}/country/${code}`);
    return response.data.result;
  } catch (error) {
    throw error;
  }
};

export const getCountries = async () => {
  try {
    const response = await axios.get(`${BASE_URL}/countries`);
    return response.data.result;
  } catch (error) {
    throw error;
  }
};

export const createFactory = async (factory) => {
  try {
    const response = await axios.post(`${BASE_URL}/factory/create`, factory);
    return response.data.result;
  } catch (error) {
    throw error;
  }
};

export const updateFactory = async (id, factory) => {
  try {
    const response = await axios.put(
      `${BASE_URL}/factory/update/${id}`,
      factory
    );
    return response.data.result;
  } catch (error) {
    throw error;
  }
};

export const getFactory = async (id) => {
  try {
    const response = await axios.get(`${BASE_URL}/factory/${id}`);
    return response.data.result;
  } catch (error) {
    throw error;
  }
};

export const getFactories = async () => {
  try {
    const response = await axios.get(`${BASE_URL}/factories`);
    return response.data.result;
  } catch (error) {
    throw error;
  }
};

export const createColor = async (color) => {
  try {
    const response = await axios.post(`${BASE_URL}/color/create`, color);
    return response.data.result;
  } catch (error) {
    throw error;
  }
};

export const updateColor = async (code, color) => {
  try {
    const response = await axios.put(`${BASE_URL}/color/update/${code}`, color);
    return response.data.result;
  } catch (error) {
    throw error;
  }
};

export const getColor = async (color) => {
  try {
    const response = await axios.get(`${BASE_URL}/color/${code}`);
    return response.data.result;
  } catch (error) {
    throw error;
  }
};

export const getColors = async () => {
  try {
    const response = await axios.get(`${BASE_URL}/colors`);
    return response.data.result;
  } catch (error) {
    throw error;
  }
};

export const createDetails = async (details) => {
  try {
    const response = await axios.post(`${BASE_URL}/details/create`, details);
    return response.data.result;
  } catch (error) {
    throw error;
  }
};

export const updateDetails = async (id, details) => {
  try {
    const response = await axios.put(
      `${BASE_URL}/details/update/${id}`,
      details
    );
    return response.data.result;
  } catch (error) {
    throw error;
  }
};

export const getDetails = async (id) => {
  try {
    const response = await axios.get(`${BASE_URL}/details/${id}`);
    return response.data.result;
  } catch (error) {
    throw error;
  }
};

export const getAllDetails = async () => {
  try {
    const response = await axios.get(`${BASE_URL}/details`);
    return response.data.result;
  } catch (error) {
    throw error;
  }
};

export const createHeel = async (heel) => {
  try {
    const response = await axios.post(`${BASE_URL}/heel/create`, heel);
    return response.data.result;
  } catch (error) {
    throw error;
  }
};

export const updateHeel = async (name, heel) => {
  try {
    const response = await axios.put(`${BASE_URL}/heel/update/${name}`, heel);
    return response.data.result;
  } catch (error) {
    throw error;
  }
};

export const getHeel = async (name) => {
  try {
    const response = await axios.get(`${BASE_URL}/heel/${name}`);
    return response.data.result;
  } catch (error) {
    throw error;
  }
};

export const getHeels = async () => {
  try {
    const response = await axios.get(`${BASE_URL}/heels`);
    return response.data.result;
  } catch (error) {
    throw error;
  }
};

export const createImage = async (image) => {
  try {
    const response = await axios.post(`${BASE_URL}/image/create`, image);
    return response.data.result;
  } catch (error) {
    throw error;
  }
};

export const updateImage = async (id, image) => {
  try {
    const response = await axios.put(`${BASE_URL}/image/update/${id}`, image);
    return response.data.result;
  } catch (error) {
    throw error;
  }
};

export const getImage = async (id) => {
  try {
    const response = await axios.get(`${BASE_URL}/image/${id}`);
    return response.data.result;
  } catch (error) {
    throw error;
  }
};

export const getImages = async () => {
  try {
    const response = await axios.get(`${BASE_URL}/images`);
    return response.data.result;
  } catch (error) {
    throw error;
  }
};

export const createInsole = async (insole) => {
  try {
    const response = await axios.post(`${BASE_URL}/insole/create`, insole);
    return response.data.result;
  } catch (error) {
    throw error;
  }
};

export const updateInsole = async (name, insole) => {
  try {
    const response = await axios.put(
      `${BASE_URL}/insole/update/${name}`,
      insole
    );
    return response.data.result;
  } catch (error) {
    throw error;
  }
};

export const getInsole = async (name) => {
  try {
    const response = await axios.get(`${BASE_URL}/insole/${name}`);
    return response.data.result;
  } catch (error) {
    throw error;
  }
};

export const getInsoles = async () => {
  try {
    const response = await axios.get(`${BASE_URL}/insoles`);
    return response.data.result;
  } catch (error) {
    throw error;
  }
};

export const createMaterial = async (material) => {
  try {
    const response = await axios.post(`${BASE_URL}/material/create`, material);
    return response.data.result;
  } catch (error) {
    throw error;
  }
};

export const updateMaterial = async (name, material) => {
  try {
    const response = await axios.put(
      `${BASE_URL}/material/update/${name}`,
      material
    );
    return response.data.result;
  } catch (error) {
    throw error;
  }
};

export const getMaterial = async (name) => {
  try {
    const response = await axios.get(`${BASE_URL}/material/${name}`);
    return response.data.result;
  } catch (error) {
    throw error;
  }
};

export const getMaterials = async () => {
  try {
    const response = await axios.get(`${BASE_URL}/materials`);
    return response.data.result;
  } catch (error) {
    throw error;
  }
};

export const createShoe = async (shoe) => {
  try {
    const response = await axios.post(`${BASE_URL}/create`, shoe);
    return response.data.result;
  } catch (error) {
    throw error;
  }
};

export const updateShoe = async (id, shoe) => {
  try {
    const response = await axios.put(`${BASE_URL}/update/${id}`, shoe);
    return response.data.result;
  } catch (error) {
    throw error;
  }
};

export const getShoe = async (id) => {
  try {
    const response = await axios.get(`${BASE_URL}/${id}`);
    return response.data.result;
  } catch (error) {
    throw error;
  }
};

export const getShoes = async () => {
  try {
    const response = await axios.get(`${BASE_URL}/all`);
    return response.data.result;
  } catch (error) {
    throw error;
  }
};

export const createSize = async (size) => {
  try {
    const response = await axios.post(`${BASE_URL}/size/create`, size);
    return response.data.result;
  } catch (error) {
    throw error;
  }
};

export const updateSize = async (number, system, size) => {
  try {
    const response = await axios.put(
      `${BASE_URL}/size/update/${system}-${number}`,
      size
    );
    return response.data.result;
  } catch (error) {
    throw error;
  }
};

export const getSize = async (number, system) => {
  try {
    const response = await axios.get(`${BASE_URL}/size/${system}-${number}`);
    return response.data.result;
  } catch (error) {
    throw error;
  }
};

export const getSizes = async () => {
  try {
    const response = await axios.get(`${BASE_URL}/sizes`);
    return response.data.result;
  } catch (error) {
    throw error;
  }
};
