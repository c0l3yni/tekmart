import type {NextApiRequest, NextApiResponse} from 'next'
import axios from "axios";

type Data = {
  name: string
}
type Payload = {
  amount: number,
  currency: string,
  source: string,
}

const URL = "http://localhost:8080";

const submitPayment = async (payload: Payload) => {
  try {
    const response = await axios.post(URL + "/purchase", payload);
    return response.data;
  } catch (error: any) {
    return error.response.data;
  }
};

export default function handler(
  req: NextApiRequest,
  res: NextApiResponse<Data>
) {
  if (req.method === 'POST') {
    const payload = req.body.payload;
    submitPayment(payload).then(data => {
      res.status(200).json(data)
    }).catch(err =>{
      res.status(400).json(err)
    })
  }
}
